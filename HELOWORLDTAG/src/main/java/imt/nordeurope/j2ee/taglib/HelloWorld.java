package imt.nordeurope.j2ee.taglib;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

public class HelloWorld extends TagSupport {
	
	protected String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().println("Hello World " + getName());
		} catch (IOException e) {
			throw new JspException("I/O Error", e);
		}
		return SKIP_BODY;
	}
}
