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

        return null;
    }

    public static CardResponse checkLength(Card card) {
        CardResponse response = new CardResponse();
        response.setCode(String.valueOf(ErrorConstants.SUCCESS));

        if (card == null) {
            response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
            response.setMessage("企业名片不能为空！");
            return response;
        }

        StringBuilder message = new StringBuilder("");
        if (card != null) {
            if (StringUtils.isEmpty(card.getTaxid())) {
                if (CardValidator.checkCompanyTaxid(card.getTaxid()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("taxid长度不合法！");
                }
            }

            if (StringUtils.isEmpty(card.getName())) {
                if (CardValidator.checkCompanyName(card.getName()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("name长度不合法！");
                }
            }

            if (StringUtils.isEmpty(card.getAddress())) {
                if (CardValidator.checkCompanyAddress(card.getAddress()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("address长度不合法！");
                }
            }


            if (StringUtils.isEmpty(card.getTelephone())) {
                if (CardValidator.checkCompanyTelephone(card.getTelephone()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("telephone长度不合法！");
                }
            }

            if (StringUtils.isEmpty(card.getBank())) {
                if (CardValidator.checkCompanyBank(card.getBank()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("bank长度不合法！");
                }
            }

            if (StringUtils.isEmpty(card.getAccount())) {
                if (CardValidator.checkCompanyAccount(card.getAccount()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("account长度不合法！");
                }
            }

            if (StringUtils.isEmpty(card.getType())) {
                if (CardValidator.checkCompanyType(card.getType()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("type长度不合法！");
                }
            }

            if (StringUtils.isEmpty(card.getCert())) {
                if (CardValidator.checkCompanyCert(card.getCert()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("cert长度不合法！");
                }
            }

            if (StringUtils.isEmpty(card.getSource())) {
                if (CardValidator.checkCompanySource(card.getSource()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("source长度不合法！");
                }
            }

            if (StringUtils.isEmpty(card.getStatus())) {
                if (CardValidator.checkCompanyStatus(card.getStatus()) != ErrorConstants.CHECK_OK) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("status长度不合法！");
                }
            }

        }
        return response;
    }

    public static CardResponse checkMessyCode(Card card) {
        CardResponse response = new CardResponse();
        response.setCode(String.valueOf(ErrorConstants.SUCCESS));

        if (card == null) {
            response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
            response.setMessage("企业名片不能为空！");
            return response;
        }

        StringBuilder message = new StringBuilder("");
        if (card != null) {
            if (StringUtils.isEmpty(card.getTaxid())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getTaxid())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("taxid不能含有乱码！");
                }
            }

            if (StringUtils.isEmpty(card.getName())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getName())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("name不能含有乱码！");
                }
            }

            if (StringUtils.isEmpty(card.getAddress())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getAddress())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("address不能含有乱码！");
                }
            }


            if (StringUtils.isEmpty(card.getTelephone())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getTelephone())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("telephone不能含有乱码！");
                }
            }

            if (StringUtils.isEmpty(card.getBank())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getBank())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("bank不能含有乱码！");
                }
            }

            if (StringUtils.isEmpty(card.getAccount())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getAccount())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("account不能含有乱码！");
                }
            }

            if (StringUtils.isEmpty(card.getType())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getType())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("type不能含有乱码！");
                }
            }

            if (StringUtils.isEmpty(card.getCert())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getCert())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("cert不能含有乱码！");
                }
            }

            if (StringUtils.isEmpty(card.getSource())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getSource())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("source不能含有乱码！");
                }
            }

            if (StringUtils.isEmpty(card.getStatus())) {
                if (nuonuo.jskp.common.utils.StringUtils.isMessyCode(card.getStatus())) {
                    response.setCode(String.valueOf(ErrorConstants.CHECK_FAIL));
                    message.append("status不能含有乱码！");
                }
            }

        }
        return response;
    }

}
