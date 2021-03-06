/*
 * Copyright 2012 Decebal Suiu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.fortsoft.wicket.plugin.demo.api;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.resource.ResourceReference;

/**
 * @author Decebal Suiu
 */
public class SimpleSection extends Section {

	private static final long serialVersionUID = 1L;

	protected ResourceReference image;

	public SimpleSection(IModel<String> title, ResourceReference image) {
		super(title);

		this.image = image;
	}

	@Override
	public ResourceReference getImage() {
		return image;
	}

	@Override
	public WebMarkupContainer getPanel(String panelId) {
		return new SimplePanel(panelId, getTitle());
	}

}
