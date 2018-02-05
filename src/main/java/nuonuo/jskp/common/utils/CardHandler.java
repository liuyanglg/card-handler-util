package nuonuo.jskp.common.utils;

import nuonuo.jskp.common.bean.Card;
import nuonuo.jskp.common.bean.CardResponse;
import nuonuo.jskp.common.constants.ErrorConstants;
import org.apache.commons.lang3.StringUtils;

/**
 *Created by  liuya
 *2018/2/1
 */
public class CardHandler {
    public static char[] specialChars = {'\\', '\'', '"'};

    /**
     * 添加企业名片接口
     * @param card
     * cardJson请求参数格式
     * {
     *     "code": "六位代码",
     *     "taxid": "税号",
     *     "name": "企业名称",
     *     "address": "注册地址",
     *     "telephone": "注册电话",
     *     "bank": "开户银行",
     *     "account": "开户账号",
     *     "type": "类型字典项",
     *     "cert": "认证字典项",
     *     "source": "来源字典项",
     *     "audit": "审核字典项",
     *     "status": "数据状态字典项"
     * }
     * @return
     */
    public static String addCard(Card card) {
        CardResponse response = new CardResponse();

        if(card!=null){
            if(StringUtils.isBlank(card.getTaxid())){
                response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
            }
        }
        String url = "";
        return null;
    }

    public static CardResponse checkLength(Card card) {
        CardResponse response = new CardResponse();
        response.setCode(String.valueOf(ErrorConstants.SUCCESS));

        if (card == null) {
            response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
            response.setMessage("企业名片不能为空！");
            return response;
        }

        if (card != null) {
            if (!StringUtils.isEmpty(card.getTaxid())) {
                if (CardValidator.checkCompanyTaxid(card.getTaxid()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("taxid长度不合法！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getName())) {
                if (CardValidator.checkCompanyName(card.getName()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("name长度不合法！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getAddress())) {
                if (CardValidator.checkCompanyAddress(card.getAddress()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("address长度不合法！");
                    return response;
                }
            }


            if (!StringUtils.isEmpty(card.getTelephone())) {
                if (CardValidator.checkCompanyTelephone(card.getTelephone()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("telephone长度不合法！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getBank())) {
                if (CardValidator.checkCompanyBank(card.getBank()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("bank长度不合法！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getAccount())) {
                if (CardValidator.checkCompanyAccount(card.getAccount()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("account长度不合法！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getType())) {
                if (CardValidator.checkCompanyType(card.getType()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("type长度不合法！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getCert())) {
                if (CardValidator.checkCompanyCert(card.getCert()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("cert长度不合法！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getSource())) {
                if (CardValidator.checkCompanySource(card.getSource()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("source长度不合法！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getStatus())) {
                if (CardValidator.checkCompanyStatus(card.getStatus()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("status长度不合法！");
                    return response;
                }
            }

        }

        return response;
    }

    public static CardResponse checkMessyCode(Card card) {
        CardResponse response = new CardResponse();
        response.setCode(String.valueOf(ErrorConstants.SUCCESS));

        if (card == null) {
            response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
            response.setMessage("企业名片不能为空！");
            return response;
        }

        StringBuilder message = new StringBuilder("");
        if (card != null) {
            if (!StringUtils.isEmpty(card.getTaxid())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getTaxid())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("taxid不能含有乱码！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getName())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getName())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("name不能含有乱码！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getAddress())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getAddress())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("address不能含有乱码！");
                    return response;
                }
            }


            if (!StringUtils.isEmpty(card.getTelephone())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getTelephone())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("telephone不能含有乱码！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getBank())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getBank())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("bank不能含有乱码！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getAccount())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getAccount())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("account不能含有乱码！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getType())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getType())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("type不能含有乱码！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getCert())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getCert())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("cert不能含有乱码！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getSource())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getSource())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("source不能含有乱码！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getStatus())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getStatus())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("status不能含有乱码！");
                    return response;
                }
            }

        }
        return response;
    }

    public static CardResponse checkSpecialChar(Card card) {
        CardResponse response = new CardResponse();
        response.setCode(String.valueOf(ErrorConstants.SUCCESS));

        if (card == null) {
            response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
            response.setMessage("企业名片不能为空！");
            return response;
        }

//        String specialString = outputSpecialChars(specialChars);
        if (card != null) {
            if (!StringUtils.isEmpty(card.getTaxid())) {
                if (isContainSpecialChar(card.getTaxid(), specialChars)) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("taxid不能含有特殊字符！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getName())) {
                if (isContainSpecialChar(card.getName(), specialChars)) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("name不能含有特殊字符！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getAddress())) {
                if (isContainSpecialChar(card.getAddress(), specialChars)) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("address不能含有特殊字符！");
                    return response;
                }
            }


            if (!StringUtils.isEmpty(card.getTelephone())) {
                if (isContainSpecialChar(card.getTelephone(), specialChars)) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("telephone不能含有特殊字符！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getBank())) {
                if (isContainSpecialChar(card.getBank(), specialChars)) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("bank不能含有特殊字符！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getAccount())) {
                if (isContainSpecialChar(card.getAccount(), specialChars)) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("account不能含有特殊字符！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getType())) {
                if (isContainSpecialChar(card.getType(), specialChars)) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("type不能含有特殊字符！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getCert())) {
                if (isContainSpecialChar(card.getCert(), specialChars)) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("cert不能含有特殊字符！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getSource())) {
                if (isContainSpecialChar(card.getSource(), specialChars)) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("source不能含有特殊字符！");
                    return response;
                }
            }

            if (!StringUtils.isEmpty(card.getStatus())) {
                if (isContainSpecialChar(card.getStatus(), specialChars)) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                    response.setMessage("status不能含有特殊字符！");
                    return response;
                }
            }

        }
        return response;
    }

    public static boolean isContainSpecialChar(String s, char[] specialChars) {
        boolean b = false;

        if (StringUtils.isEmpty(s) || specialChars == null || specialChars.length < 0) {
            return false;
        }

        for (char c : specialChars) {
            if (s.contains(c + "")) {
                b = true;
                break;
            }
        }

        return b;
    }

    public static String outputSpecialChars(char[] specialChars) {
        if (specialChars == null || specialChars.length < 0) {
            return null;
        }

        StringBuilder builder = new StringBuilder("");
        for (char c : specialChars) {
            builder.append(c + ",");
        }

        if (builder.length() > 0) {
            builder.deleteCharAt(builder.length() - 1);
        }
        return builder.toString();
    }
}
