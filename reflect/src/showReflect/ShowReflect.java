package showReflect;

import java.lang.reflect.Method;

public class ShowMethods {
	private static String usage=
			"usage"+
	"showMethods qualified.class.name\n"+
					"To show all methods in class or:\n"+
	"showMethods qualified.class.name word\n"+
					"To search for methods involving 'word'";
	private static Pattern p=Pattern.compile("\\w+\\.");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    if(args.length<1){
    	System.out.println(usage);
    	System.exit(0);
    }
    int lines=0;
    try{
    	Class<?> c=Class.forName(args[0]);
    	Method[] methods=c.getMethods();
    	Constructor[] ctors=c.getConstructors();
    	if(args.length==1){
    		for(Method method:methods)
    			System.out.println(p.matcher(method.toString()));
    		for(Constructor cotr:ctors)
    			System.out.println(p.matcher(cotr.toString()));
    		lines=methods.length+ctors.length;
    	}else{
    		for(Method method:methods)
    			if(method.toString().indexOf(args[1])!=-1){
    			System.out.println(method.toString());
    		lines++;
    			}
    	      }
    	    for(Constructor ctor:ctors)
    	    	if(ctor.toString().indexOf(args[1])!=-1){
    	    		System.out.println(p.matcher(ctor.toString()).replaceAll(""));
    	    		lines++;
    	    	}
    }catch(ClassNotFoundException e){
    	System.out.println("No such class"+e);
    }
	}