package string;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ParseMath {

	public static void main(String[] args) throws ScriptException {
		String one = "10+15*20-5/5";
		String two = "3+5-6";

		ScriptEngineManager engine=new ScriptEngineManager();
		ScriptEngine script=engine.getEngineByName("Nashorn");
		System.out.println(script.eval(one));
		System.out.println(script.eval(two));
	}

}
