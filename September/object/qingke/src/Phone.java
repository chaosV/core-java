class Phone {
	String model;
	String brand;
	int price;
	String owner;

	Boolean call(String phoneNo) {
		System.out.println("���ڸ�" + phoneNo + "��绰");
		if (phoneNo.length() == 0) {
			System.out.println("��绰ok");
			return true;
		} else {
			System.out.println("��绰wrong");
			return false;
		}
	}

	void text(String phoneNo, String msg) {
		System.out.println(msg + phoneNo);
	}

	public static void main(String[] args) {
		Phone z = new Phone();
		z.text("22222", "zc");
		z.call("1z1");
		z.brand = ("aa");
		System.out.println(z.brand);
	}
}
