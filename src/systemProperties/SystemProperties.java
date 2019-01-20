package systemProperties;

public class SystemProperties {
	public void property() {
		System.out.println("java version:"+System.getProperty("java.version"));
		System.out.println("java url:"+System.getProperty("java.vendor.url"));
		System.out.println("java home:"+System.getProperty("java.home"));
		System.out.println("java vm specification version:"+System.getProperty("java.vm.specification.version"));
		System.out.println("java class path:"+System.getProperty("java.class.path"));
		System.out.println("java os name:"+System.getProperty("os.name"));
		System.out.println("java user dir:"+System.getProperty("user.dir"));
		System.out.println("java ext dirs:"+System.getProperty("java.ext.dirs"));
	}
}
