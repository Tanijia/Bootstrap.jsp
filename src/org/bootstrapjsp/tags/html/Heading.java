package org.bootstrapjsp.tags.html;

import org.bootstrapjsp.tags.Component;
import org.tldgen.annotations.Attribute;
import org.tldgen.annotations.BodyContent;
import org.tldgen.annotations.Tag;

@Tag(bodyContent=BodyContent.SCRIPTLESS,dynamicAttributes=true)
public class Heading extends Component {

	public Heading() {
		this(1);
	}

	public Heading(int level) {
		super("");
		this.setLevel(level);
	}
	
	/**
	 * Sets the heading level (i.e. 1 = &lt;h1&gt;, 2 = &lt;h2&gt;, etc).
	 */
	@Attribute(rtexprvalue=true)
	public void setLevel(int level) {
		if (level > 0 && level < 7) {
			super.setElement("h" + level);
		} else {
			throw new IllegalArgumentException("Illegal level: " + level);
		}
	}
}
