/*
 * Copyright (c) 2014 Darren Scott - All Rights Reserved
 * 
 * This program is distributed under LGPL Version 2.1 in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY.
 */
package org.bootstrapjsp.tags.core.misc;

import org.bootstrapjsp.dialect.Html;
import org.bootstrapjsp.facet.LabelFacet;
import org.bootstrapjsp.facet.Labelable;
import org.bootstrapjsp.tags.Component;
import org.bootstrapjsp.tags.html.Heading;
import org.tldgen.annotations.Attribute;
import org.tldgen.annotations.BodyContent;
import org.tldgen.annotations.Tag;

@Tag(name="pageheader",bodyContent=BodyContent.SCRIPTLESS,dynamicAttributes=true)
public class PageHeader extends Component implements Labelable {

	final Heading heading = new Heading();

	public PageHeader() {
		super(Html.DIV_ELEMENT);
		super.setAttribute(Html.CLASS_ATTRIBUTE, "page-header");
		super.addFacet(new LabelFacet());
		super.appendChild(this.heading);
	}

	@Override
	public void applyLabel(String label) {
		this.heading.setBody(label);
	}

	@Attribute(rtexprvalue=true)
	public void setLevel(int level) {
		if (level > 0 && level < 7) {
			this.heading.setLevel(level);
		} else {
			throw new IllegalArgumentException("Illegal level: " + level);
		}
	}
}
