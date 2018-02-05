package nuonuo.jskp.common.bean;

/**
 * 企业名片信息
 */
public class Card {

    private String code;
    private String taxid;
    private String name;
    private String address;
    private String telephone;
    private String bank;
    private String account;
    private String type;
    private String cert;
    private String source;
    private String status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTaxid() {
        return taxid;
    }

    public void setTaxid(String taxid) {
        this.taxid = taxid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        int len = builder.length();
        if (code != null && code.trim().length() > 0) {
            builder.append("\"code\":\"" + code +"\",");
        }
        if (taxid != null && taxid.trim().length() > 0) {
            builder.append("\"taxid\":\"" + taxid +"\",");
        }
        if (name != null && name.trim().length() > 0) {
            builder.append("\"name\":\"" + name +"\",");
        }
        if (address != null && address.trim().length() > 0) {
            builder.append("\"address\":\"" + address +"\",");
        }
        if (telephone != null && telephone.trim().length() > 0) {
            builder.append("\"telephone\":\"" + telephone +"\",");
        }
        if (bank != null && bank.trim().length() > 0) {
            builder.append("\"bank\":\"" + bank +"\",");
        }
        if (account != null && account.trim().length() > 0) {
            builder.append("\"account\":\"" + account +"\",");
        }
        if (type != null && type.trim().length() > 0) {
            builder.append("\"type\":\"" + type +"\",");
        }
        if (cert != null && cert.trim().length() > 0) {
            builder.append("\"cert\":\"" + cert +"\",");
        }
        if (source != null && source.trim().length() > 0) {
            builder.append("\"source\":\"" + source +"\",");
        }
        if (status != null && status.trim().length() > 0) {
            builder.append("\"status\":\"" + status +"\",");
        }
        if (builder.length() > len) {
            builder.deleteCharAt(builder.length() - 1);
        }

        builder.append("}");
        return builder.toString();
    }
}
