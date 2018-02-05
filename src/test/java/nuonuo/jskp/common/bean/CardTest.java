package nuonuo.jskp.common.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import nuonuo.jskp.common.constants.ErrorConstants;
import nuonuo.jskp.common.utils.CardHandler;
import org.junit.Test;

/**
 *Created by  liuya
 *2018/2/2
 */
public class CardTest {
    String cardJson = "{\n" +
            "    \"code\":\"ABCDEF\",\n" +
            "    \"taxid\":\"ABCDEFGHJKL123456789\",\n" +
            "    \"name\":\"Hello\\Y\"\n" +
            "}";

    @Test
    public void testFastJson() {
        System.out.println("card json: " + cardJson);
        String regex = "\\\\";
        String replacement = "/";
        String newJson = cardJson.replaceAll(regex, replacement);
        System.out.println("replace card json: " + newJson);
        Card card = JSON.parseObject(newJson, Card.class);
        System.out.println(card);
    }

    @Test
    public void testCardValid() {
        System.out.println(CardHandler.outputSpecialChars(CardHandler.specialChars));
        long start = System.currentTimeMillis();
        Card card = new Card();
//        card.setTaxid("QWE");
        card.setName("索尼爱立信XXX公司DFFF");
        CardResponse response = CardHandler.checkLength(card);
        if(Integer.parseInt(response.getCode())== ErrorConstants.SUCCESS){
            response = CardHandler.checkMessyCode(card);
        }
        if (Integer.parseInt(response.getCode()) == ErrorConstants.SUCCESS) {
            response = CardHandler.checkSpecialChar(card);
        }
        response.setData(card);
        long end = System.currentTimeMillis();

        System.out.println(card.toString());
        System.out.println(response.toString());
        System.out.println(JSON.toJSONString(response));
        System.out.println("cost:" + (end - start));

        CardResponse<Card>apiResponse = JSON.parseObject(response.toString(), new TypeReference<CardResponse<Card>>() {
        });

        System.out.println(apiResponse.toString());

    }
}