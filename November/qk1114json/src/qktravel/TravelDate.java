package qktravel;

public class TravelDate {
	private boolean ret;
	private String errcode;
	private String errmsg;
	private int ver;
	private Data data;
	
	public boolean isRet() {
		return ret;
	}
	public void setRet(boolean ret) {
		this.ret = ret;
	}
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public int getVer() {
		return ver;
	}
	public void setVer(int ver) {
		this.ver = ver;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "TravelDate [ret=" + ret + ", errcode=" + errcode + ", errmsg=" + errmsg + ", ver=" + ver + ", data="
				+ data + "]";
	}


	
	
	
	
}
