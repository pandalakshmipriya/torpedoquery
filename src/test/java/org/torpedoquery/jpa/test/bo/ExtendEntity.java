/**
 * Copyright (C) ${project.inceptionYear} Xavier Jodoin (xavier@jodoin.me)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 *   Copyright Xavier Jodoin xjodoin@torpedoquery.org
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 * @author xjodoin
 * @version $Id: $Id
 * @since 2.0.0
 */
package org.torpedoquery.jpa.test.bo;
public class ExtendEntity extends Entity {

	private String specificField;

	/**
	 * <p>Getter for the field <code>specificField</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpecificField() {
		return specificField;
	}

	/**
	 * <p>Setter for the field <code>specificField</code>.</p>
	 *
	 * @param specificField a {@link java.lang.String} object.
	 */
	public void setSpecificField(String specificField) {
		this.specificField = specificField;
	}

	/** {@inheritDoc} */
	@Override
	public SubEntity getSubEntity() {
		return super.getSubEntity();
	}
	
	/** {@inheritDoc} */
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}