package nuonuo.jskp.common.bean;

import com.alibaba.fastjson.JSON;
import nuonuo.jskp.common.utils.CardHandler;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
    public  void testAddCard() throws Exception{
        long start = 0L;
        long end = 0L;

        String url = "http://192.168.210.80:8822";
//        String url = "http://192.168.210.80:8822";
        Card card = new Card();
        card.setTaxid("LIUYANGTEST000001\"");
        card.setName("LIUYANGTEST企业名称01");
        card.setBank("Bank");

        Map map = new HashMap();
        map.put("taxid", "LIUYANGTEST000001");
//        map.put("name", "LIUYANGTEST企业名称01");
        map.put("bank", "bank..");
        start = System.currentTimeMillis();
//        String response=CardHandler.addCard(url, card.toString());
        String response=CardHandler.addCard(url, map);
        end = System.currentTimeMillis();

        System.out.println("cost: "+(end-start));
        System.out.println(response);
    }

    @Test
    public void testEqual(){
        String s1 = "91320115MA1MLR5B9F";
        String s2 = "91320115MA1MLR5B9F";
        System.out.println(s1.equals(s2));
    }

    @Test
    public void testUpdateCard() throws Exception{
        Card card = new Card();
        card.setCode("63QPD5");
        card.setTaxid("LIUYANGTEST000001");
        card.setName("LIUYANGTEST企业名称01XX");
        card.setBank("Bank");

        long start = 0L;
        long end = 0L;

        String url = "http://192.168.210.80:8823";
        start = System.currentTimeMillis();
        String response=CardHandler.updateCard(url, card);
        end = System.currentTimeMillis();
        System.out.println("cost: "+(end-start));
        System.out.println(response);
    }

    @Test
    public void testGetCard() throws Exception{
        Card card = new Card();
        card.setCode("5UJ4XD");
        card.setTaxid("LIUYANGTEST000001");
        card.setName("LIUYANGTEST企业名称01XX");
        card.setBank("Bank");

        long start = 0L;
        long end = 0L;

        String url = "http://192.168.210.80:8823";
        start = System.currentTimeMillis();
        String response=CardHandler.getCard(url, card.getCode());
        end = System.currentTimeMillis();
        System.out.println("cost: "+(end-start));
        System.out.println(response);
    }
}