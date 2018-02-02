package nuonuo.jskp.common.utils;

import nuonuo.jskp.common.constants.CardConstants;
import nuonuo.jskp.common.constants.ErrorConstants;
import org.apache.commons.lang3.StringUtils;
/**
 * Created by hwz on 2017-11-06.
 * 企业名片相关校验类
 */
public class  CardValidator {

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
}
