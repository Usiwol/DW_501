package class501;

public class desk implements ban_active{

	@Override
	public String action(String msg) {
		System.out.println("책상이다.");
		return null;
	}

}