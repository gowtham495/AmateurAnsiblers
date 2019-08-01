import java.util.*;

import java.io.*;

import java.nio.charset.Charset;

import javax.el.ExpressionFactory;

import com.hubspot.jinjava.doc.*;
import com.hubspot.jinjava.el.*;
import com.hubspot.jinjava.interpret.*;
import com.hubspot.jinjava.loader.*;

import de.odysseus.el.*;


/**
 * The main client API for the Jinjava library, instances of this class can be used to render jinja templates with a given map of context values. Example use:
 *
 * <pre>
 * Jinjava jinjava = new Jinjava();
 * Map&lt;String, Object&gt; context = new HashMap&lt;&gt;();
 * context.put(&quot;name&quot;, &quot;Jared&quot;);
 * // ..
 * String template = &quot;Hello, {{ name }}&quot;;
 * String renderedTemplate = jinjava.render(template, context);
 * </pre>
 *
 * 
 */
public class Test {
public static void main(String args[]){
		
Test jinjava = new Test();
Map context=new HashMap();  

//Map<String, Object> context = Maps.newHashMap();
context.put("name", "Jared");

String template = Resources.toString(Resources.getResource("my-template.html"), Charsets.UTF_8);

String renderedTemplate = jinjava.render(template, context);

}
}