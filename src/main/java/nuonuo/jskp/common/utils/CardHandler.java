package nuonuo.jskp.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import nuonuo.jskp.common.bean.Card;
import nuonuo.jskp.common.bean.CardResponse;
import nuonuo.jskp.common.constants.ErrorConstants;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Map;

import static nuonuo.jskp.common.utils.CardValidator.addCardValid;
import static nuonuo.jskp.common.utils.CardValidator.updateCardValid;


/**
 *Created by  liuya
 *2018/2/1
 */
public class CardHandler {
    /**
     * 获取企业名片接口
     * @param url
     * url格式：http://ip:port 或者域名形式
     * @param code 六位开票代码
     * @return
     * {
     *     "code":"响应码",
     *     "message":"错误信息",
     *     data:{
     *          "code": "六位代码",
     *          "taxid": "税号",
     *          "name": "企业名称",
     *          "address": "注册地址",
     *          "telephone": "注册电话",
     *          "bank": "开户银行",
     *          "account": "开户账号",
     *          "type": "类型字典项",
     *          "cert": "认证字典项",
     *          "source": "来源字典项",
     *          "status": "数据状态字典项"
     *     }
     * }
     */
    public static String getCard(String url, String code) throws IOException {
        String apiSuffix = "/v1/cards/";
        String result = null;

        if (StringUtils.isBlank(code) || code.length() != 6) {
            CardResponse response = new CardResponse();
            response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
            response.setMessage("六位代码格式有误");
            return JSON.toJSONString(response);
        }

        url = url.trim() + apiSuffix + code;
        CloseableHttpClient httpClient = null;

        httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        get.addHeader("Content-type", "application/json");

        HttpResponse response = httpClient.execute(get);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            result = EntityUtils.toString(entity);
        }
        return result;
    }

    /**
     * 删除企业名片接口
     * @param url
     * url格式：http://ip:port 或者域名形式
     * @param code 六位开票代码
     * @return
     * {
     *     "code":"响应码",
     *     "message":"错误信息",
     *     data:{
     *          "code": "六位代码",
     *          "taxid": "税号",
     *          "name": "企业名称",
     *          "address": "注册地址",
     *          "telephone": "注册电话",
     *          "bank": "开户银行",
     *          "account": "开户账号",
     *          "type": "类型字典项",
     *          "cert": "认证字典项",
     *          "source": "来源字典项",
     *          "status": "数据状态字典项"
     *     }
     * }
     */
    public static String deleteCard(String url, String code) throws IOException {
        String apiSuffix = "/v1/cards/";
        String result = null;

        if (StringUtils.isBlank(code) || code.length() != 6) {
            CardResponse response = new CardResponse();
            response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
            response.setMessage("六位代码格式有误");
            return JSON.toJSONString(response);
        }

        url = url.trim() + apiSuffix + code;
        CloseableHttpClient httpClient = null;

        httpClient = HttpClients.createDefault();
        HttpDelete delete = new HttpDelete(url);
        delete.addHeader("Content-type", "application/json");

        HttpResponse response = httpClient.execute(delete);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            result = EntityUtils.toString(entity);
        }
        return result;
    }

    /**
     * 添加企业名片接口
     * @param url
     * url格式：http://ip:port 或者域名形式
     * @param json
     * json请求参数格式
     * {
     *     "taxid": "税号",(非空)
     *     "name": "企业名称",(非空)
     *     "address": "注册地址",
     *     "telephone": "注册电话",
     *     "bank": "开户银行",
     *     "account": "开户账号",
     *     "type": "类型字典项",
     *     "cert": "认证字典项",
     *     "source": "来源字典项",
     *     "status": "数据状态字典项"
     * }
     * @return
     * {
     *     "code":"响应码",
     *     "message":"错误信息",
     *     data:{
     *          "code": "六位代码",
     *          "taxid": "税号",
     *          "name": "企业名称",
     *          "address": "注册地址",
     *          "telephone": "注册电话",
     *          "bank": "开户银行",
     *          "account": "开户账号",
     *          "type": "类型字典项",
     *          "cert": "认证字典项",
     *          "source": "来源字典项",
     *          "status": "数据状态字典项"
     *     }
     * }
     */
    public static String addCard(String url, String json) throws Exception {
        String result = null;

        CardResponse response = jsonToCard(json);
        if (String.valueOf(ErrorConstants.SUCCESS).equals(response.getCode())) {
            result = addCard(url, (Card) response.getData());
        } else {
            result = JSON.toJSONString(response);
        }

        return result;
    }

    public static String addCard(String url, Map map) throws Exception {
        String result = null;

        CardResponse response = mapToCard(map);
        if (String.valueOf(ErrorConstants.SUCCESS).equals(response.getCode())) {
            result = addCard(url, (Card) response.getData());
        } else {
            result = JSON.toJSONString(response);
        }

        return result;
    }

    public static String addCard(String url, Card card) throws IOException {
        String apiSuffix = "/v1/cards";
        String result = null;

        CardResponse cardResponse = addCardValid(card);
        if (Integer.parseInt(cardResponse.getCode()) != ErrorConstants.SUCCESS) {
            return JSON.toJSONString(cardResponse);
        }

        url = url.trim() + apiSuffix;
        CloseableHttpClient httpClient = null;

        httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        StringEntity request = new StringEntity(card.toString(), "utf-8");
        post.addHeader("Content-type", "application/json");
        post.setEntity(request);

        HttpResponse response = httpClient.execute(post);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            result = EntityUtils.toString(entity);
        }
        return result;
    }

    /**
     * 修改企业名片接口
     * @param url
     * url格式：http://ip:port 或者域名形式
     * @param json
     * json请求参数格式
     * {
     *     "code": "六位代码",(非空)
     *     "taxid": "税号",
     *     "name": "企业名称",
     *     "address": "注册地址",
     *     "telephone": "注册电话",
     *     "bank": "开户银行",
     *     "account": "开户账号",
     *     "type": "类型字典项",
     *     "cert": "认证字典项",
     *     "source": "来源字典项",
     *     "status": "数据状态字典项"
     * }
     * @return
     * {
     *     "code":"响应码",
     *     "message":"错误信息",
     *     data:{
     *          "code": "六位代码",
     *          "taxid": "税号",
     *          "name": "企业名称",
     *          "address": "注册地址",
     *          "telephone": "注册电话",
     *          "bank": "开户银行",
     *          "account": "开户账号",
     *          "type": "类型字典项",
     *          "cert": "认证字典项",
     *          "source": "来源字典项",
     *          "status": "数据状态字典项"
     *     }
     * }
     */
    public static String updateCard(String url, String json) throws Exception {
        String result = null;

        CardResponse response = jsonToCard(json);
        if (String.valueOf(ErrorConstants.SUCCESS).equals(response.getCode())) {
            result = updateCard(url, (Card) response.getData());
        } else {
            result = JSON.toJSONString(response);
        }

        return result;
    }

    public static String updateCard(String url, Map map) throws Exception {
        String result = null;

        CardResponse response = mapToCard(map);
        if (String.valueOf(ErrorConstants.SUCCESS).equals(response.getCode())) {
            result = updateCard(url, (Card) response.getData());
        } else {
            result = JSON.toJSONString(response);
        }

        return result;
    }

    public static String updateCard(String url, Card card) throws IOException {
        String apiSuffix = "/v1/cards/";
        String result = null;

        CardResponse cardResponse = updateCardValid(card);
        if (Integer.parseInt(cardResponse.getCode()) != ErrorConstants.SUCCESS) {
            return JSON.toJSONString(cardResponse);
        }

        url = url.trim() + apiSuffix + card.getCode();
        CloseableHttpClient httpClient = null;

        httpClient = HttpClients.createDefault();
        HttpPut put = new HttpPut(url);
        StringEntity request = new StringEntity(card.toString(), "utf-8");
        put.addHeader("Content-type", "application/json");
        put.setEntity(request);

        HttpResponse response = httpClient.execute(put);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            result = EntityUtils.toString(entity);
        }
        return result;
    }

    public static CardResponse jsonToCard(String json) {
        boolean success = true;
        Card card = null;

        CardResponse response = new CardResponse();
        response.setCode(String.valueOf(ErrorConstants.SUCCESS));

        try {
            if (!StringUtils.isBlank(json)) {
                card = JSON.parseObject(json, new TypeReference<Card>() {
                });
            }
        } catch (Exception e) {
            success = false;
        }

        if (card == null) {
            success = false;
        }

        if (!success) {
            response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
            response.setMessage("参数格式不正确！");
        } else {
            response.setData(card);
        }

        return response;
    }

    public static CardResponse mapToCard(Map map) {
        CardResponse response = new CardResponse();
        response.setCode(String.valueOf(ErrorConstants.SUCCESS));

        if (map == null) {
            response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
            response.setMessage("参数格式不正确！");
            return response;
        }
        Card card = new Card();
        String code = (String) map.get("code");
        String taxid = (String) map.get("taxid");
        String name = (String) map.get("name");
        String address = (String) map.get("address");
        String telephone = (String) map.get("telephone");
        String bank = (String) map.get("bank");
        String account = (String) map.get("account");
        String type = (String) map.get("type");
        String cert = (String) map.get("cert");
        String source = (String) map.get("source");
        String status = (String) map.get("status");

        if (!StringUtils.isBlank(code)) {
            card.setCode(code);
        }

        if (!StringUtils.isBlank(taxid)) {
            card.setTaxid(taxid);
        }

        if (!StringUtils.isBlank(name)) {
            card.setName(name);
        }
        if (!StringUtils.isBlank(address)) {
            card.setAddress(address);
        }
        if (!StringUtils.isBlank(telephone)) {
            card.setTelephone(telephone);
        }
        if (!StringUtils.isBlank(bank)) {
            card.setBank(bank);
        }
        if (!StringUtils.isBlank(account)) {
            card.setAccount(account);
        }
        if (!StringUtils.isBlank(type)) {
            card.setType(type);
        }
        if (!StringUtils.isBlank(cert)) {
            card.setCert(cert);
        }
        if (!StringUtils.isBlank(source)) {
            card.setSource(source);
        }
        if (!StringUtils.isBlank(status)) {
            card.setStatus(status);
        }

        response.setData(card);
        return response;
    }
}