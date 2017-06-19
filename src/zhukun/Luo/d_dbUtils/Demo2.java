package zhukun.Luo.d_dbUtils;

import zhukun.Luo.c_jdbc.Admin;

public class Demo2<T> {

	public Demo2(Class clazz){
		
	}
	
	public static void main(String[] args) {
		Demo2<Admin> demo = new Demo2<Admin>(Admin.class);
	}
	
}
