package easy;

class IPAddress {
	public String defangIPaddr(String address) {
		String ans = "";
		for (int i = 0; i <= address.length() - 1; i++) {
			char ch = address.charAt(i);
			if (ch == '.') {
				ans = ans + "[.]";
			} else {
				ans = ans + ch;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		IPAddress ip = new IPAddress();
		System.out.println(ip.defangIPaddr("1.1.1."));
	}
}