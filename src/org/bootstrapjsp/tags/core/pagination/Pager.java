/*
 * Copyright (c) 2014 Darren Scott - All Rights Reserved
 * 
 * This program is distributed under LGPL Version 2.1 in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY.
 */
package org.bootstrapjsp.tags.core.pagination;

import org.bootstrapjsp.dialect.Html;
import org.bootstrapjsp.tags.Component;
import org.tldgen.annotations.BodyContent;
import org.tldgen.annotations.Tag;

@Tag(bodyContent=BodyContent.SCRIPTLESS,dynamicAttributes=true)
public class Pager extends Component {

	public Pager() {
		super("ul");
		super.setAttribute(Html.CLASS_ATTRIBUTE, "pager");
	}
	
}
