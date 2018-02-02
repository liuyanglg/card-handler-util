package nuonuo.jskp.common.bean;

import com.alibaba.fastjson.JSON;
import nuonuo.jskp.common.constants.ErrorConstants;
import nuonuo.jskp.common.utils.CardHandler;
import org.junit.Test;

/**
 *Created by  liuya
 *2018/2/2
 */
public class CardTest  {
    String cardJson = "{\n" +
            "    \"code\":\"ABCDEF\",\n" +
            "    \"taxid\":\"ABCDEFGHJKL123456789\",\n" +
            "    \"name\":\"Hello\\Y\"\n" +
            "}";

    @Test
    public void testFastJson() {
        System.out.println("card json: "+cardJson);
        String regex = "\\\\";
        String replacement = "/";
        String newJson=cardJson.replaceAll(regex, replacement);
        System.out.println("replace card json: "+newJson);
        Card card = JSON.parseObject(newJson, Card.class);
        System.out.println(card);
    }

    @Test
    public void testCardValid() {
        System.out.println(CardHandler.outputSpecialChars(CardHandler.specialChars));
        Card card = new Card();
        card.setTaxid("QWERTYUIOOPASLLLL");
        card.setName("索尼爱立信XXX公司\\");
        CardResponse response = CardHandler.checkLength(card);
        if(Integer.parseInt(response.getCode())==ErrorConstants.SUCCESS){
            response = CardHandler.checkMessyCode(card);
        }

        if(Integer.parseInt(response.getCode())==ErrorConstants.SUCCESS){
            response = CardHandler.checkSpecialChar(card);
        }

        String json = JSON.toJSONString(response);
        System.out.println(json);
    }
}