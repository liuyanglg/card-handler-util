package nuonuo.jskp.common.utils;

import nuonuo.jskp.common.bean.Card;
import nuonuo.jskp.common.bean.CardResponse;
import nuonuo.jskp.common.constants.CardConstants;
import nuonuo.jskp.common.constants.ErrorConstants;
import org.apache.commons.lang3.StringUtils;
/**
 * Created by hwz on 2017-11-06.
 * 企业名片相关校验类
 */
public class  CardValidator {
    public static char[] specialChars = {'\\', '\'', '"'};

    /**
     * 校验企业名称（长度是否符合，是否不为空等)
     * @param name 企业名称
     * @return   校验结果 1：成功 其他为失败，参见ErrorConstants定义
     */
    public static int checkCompanyName(String name){
        if(StringUtils.isBlank(name)){
            return ErrorConstants.CHECK_EMPTY_FAIL;
        }

        int len = name.trim().length();
        if (len< CardConstants.COMPANY_NAME_MIN_LEN || len>CardConstants.COMPANY_NMAE_MAX_LEN) {
            return ErrorConstants.CHECK_NAME_LEN_FAIL;
        }


        return ErrorConstants.CHECK_OK;
    }

    /**
     * 校验企业税号（长度是否符合，是否不为空等)
     * @param taxid 企业税号
     * @return   校验结果 1：成功 其他为失败，参见ErrorConstants定义
     */
    public static int checkCompanyTaxid(String taxid){
        if(StringUtils.isBlank(taxid)){
            return ErrorConstants.CHECK_EMPTY_FAIL;
        }

        int len = taxid.trim().length();
        if (len< CardConstants.COMPANY_TAXID_MIN_LEN || len>CardConstants.COMPANY_TAXID_MAX_LEN) {
            return ErrorConstants.CHECK_FAIL;
        }

        return ErrorConstants.CHECK_OK;
    }

    /**
     * 校验企业地址（长度是否符合，是否不为空等)
     * @param address 企业地址
     * @return   校验结果 1：成功 其他为失败，参见ErrorConstants定义
     */
    public static int checkCompanyAddress(String address){
        if(StringUtils.isBlank(address)){
            return ErrorConstants.CHECK_EMPTY_FAIL;
        }

        int len = address.trim().length();
        if (len< CardConstants.COMPANY_ADDRESS_MIN_LEN || len>CardConstants.COMPANY_ADDRESS_MAX_LEN) {
            return ErrorConstants.CHECK_FAIL;
        }

        return ErrorConstants.CHECK_OK;
    }

    /**
     * 校验银行名称（长度是否符合，是否不为空等)
     * @param bank 银行名称
     * @return   校验结果 1：成功 其他为失败，参见ErrorConstants定义
     */
    public static int checkCompanyBank(String bank){
        if(StringUtils.isBlank(bank)){
            return ErrorConstants.CHECK_EMPTY_FAIL;
        }

        int len = bank.trim().length();
        if (len< CardConstants.COMPANY_BANK_MIN_LEN || len>CardConstants.COMPANY_BANK_MAX_LEN) {
            return ErrorConstants.CHECK_FAIL;
        }

        return ErrorConstants.CHECK_OK;
    }

    /**
     * 校验银行账号（长度是否符合，是否不为空等)
     * @param account 银行账号
     * @return   校验结果 1：成功 其他为失败，参见ErrorConstants定义
     */
    public static int checkCompanyAccount(String account){
        if(StringUtils.isBlank(account)){
            return ErrorConstants.CHECK_EMPTY_FAIL;
        }

        int len = account.trim().length();
        if (len< CardConstants.COMPANY_ACCOUNT_MIN_LEN || len>CardConstants.COMPANY_ACCOUNT_MAX_LEN) {
            return ErrorConstants.CHECK_FAIL;
        }

        return ErrorConstants.CHECK_OK;
    }

    /**
     * 校验电话（长度是否符合，是否不为空等)
     * @param telephone 电话
     * @return   校验结果 1：成功 其他为失败，参见ErrorConstants定义
     */
    public static int checkCompanyTelephone(String telephone){
        if(StringUtils.isBlank(telephone)){
            return ErrorConstants.CHECK_EMPTY_FAIL;
        }

        int len = telephone.trim().length();
        if (len< CardConstants.COMPANY_TELEPHONE_MIN_LEN || len>CardConstants.COMPANY_TELEPHONE_MAX_LEN) {
            return ErrorConstants.CHECK_FAIL;
        }

        return ErrorConstants.CHECK_OK;
    }

    /**
     * 校验企业认证状态（长度是否符合，是否不为空等)
     * @param cert 认证状态
     * @return   校验结果 1：成功 其他为失败，参见ErrorConstants定义
     */
    public static int checkCompanyCert(String cert){
        if(StringUtils.isBlank(cert)){
            return ErrorConstants.CHECK_EMPTY_FAIL;
        }

        int len = cert.trim().length();
        if (len< CardConstants.COMPANY_CERT_MIN_LEN || len>CardConstants.COMPANY_CERT_MAX_LEN) {
            return ErrorConstants.CHECK_FAIL;
        }

        return ErrorConstants.CHECK_OK;
    }

    /**
     * 校验企业类型（长度是否符合，是否不为空等)
     * @param type 企业类型
     * @return   校验结果 1：成功 其他为失败，参见ErrorConstants定义
     */
    public static int checkCompanyType(String type){
        if(StringUtils.isBlank(type)){
            return ErrorConstants.CHECK_EMPTY_FAIL;
        }

        int len = type.trim().length();
        if (len< CardConstants.COMPANY_TYPE_MIN_LEN || len>CardConstants.COMPANY_TYPE_MAX_LEN) {
            return ErrorConstants.CHECK_FAIL;
        }

        return ErrorConstants.CHECK_OK;
    }

    /**
     * 校验企业来源（长度是否符合，是否不为空等)
     * @param name 企业来源
     * @return   校验结果 1：成功 其他为失败，参见ErrorConstants定义
     */
    public static int checkCompanySource(String name){
        if(StringUtils.isBlank(name)){
            return ErrorConstants.CHECK_EMPTY_FAIL;
        }

        int len = name.trim().length();
        if (len< CardConstants.COMPANY_SOURCE_MIN_LEN || len>CardConstants.COMPANY_SOURCE_MAX_LEN) {
            return ErrorConstants.CHECK_FAIL;
        }

        return ErrorConstants.CHECK_OK;
    }

    /**
     * 校验审核状态（长度是否符合，是否不为空等)
     * @param status 审核状态
     * @return   校验结果 1：成功 其他为失败，参见ErrorConstants定义
     */
    public static int checkCompanyStatus(String status){
        if(StringUtils.isBlank(status)){
            return ErrorConstants.CHECK_EMPTY_FAIL;
        }

        int len = status.trim().length();
        if (len< CardConstants.COMPANY_STATUS_MIN_LEN || len>CardConstants.COMPANY_STATUS_MAX_LEN) {
            return ErrorConstants.CHECK_FAIL;
        }

        return ErrorConstants.CHECK_OK;
    }

    public static CardResponse addCardValid(Card card) {
        CardResponse response = new CardResponse();
        response.setCode(String.valueOf(ErrorConstants.SUCCESS));

        if (card != null) {
            if (StringUtils.isBlank(card.getTaxid()) || StringUtils.isBlank(card.getName())) {
                response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                response.setMessage("企业名称或税号不能为空");
            }
        }

        if (Integer.parseInt(response.getCode()) == ErrorConstants.SUCCESS) {
            response = CardValidator.checkLength(card);
        }
        if (Integer.parseInt(response.getCode()) == ErrorConstants.SUCCESS) {
            response = CardValidator.checkMessyCode(card);
        }
        if (Integer.parseInt(response.getCode()) == ErrorConstants.SUCCESS) {
            response = CardValidator.checkSpecialChar(card);
        }

        return response;
    }

    public static CardResponse updateCardValid(Card card) {
        CardResponse response = new CardResponse();
        response.setCode(String.valueOf(ErrorConstants.SUCCESS));

        if (card != null) {
            if (StringUtils.isBlank(card.getCode())) {
                response.setCode(String.valueOf(ErrorConstants.CHECK_BAD_REQUEST));
                response.setMessage("六位代码不能为空");
            }
        }

        if (Integer.parseInt(response.getCode()) == ErrorConstants.SUCCESS) {
            response = CardValidator.checkLength(card);
        }
        if (Integer.parseInt(response.getCode()) == ErrorConstants.SUCCESS) {
            response = CardValidator.checkMessyCode(card);
        }
        if (Integer.parseInt(response.getCode()) == ErrorConstants.SUCCESS) {
            response = CardValidator.checkSpecialChar(card);
        }

        return response;
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
