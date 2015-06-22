package org.qunix.maven.structure.plugin.core.types;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public enum StructureOutput {

	
	SPACE(" "),
	NEW_LINE("\n"),
	COLON(":"),
	VERTICAL_BAR("|"),
	LOW_LINE("|__ "),
	BACKSLASH_LOWLINE("\\__ "),
	TAB("\t"),
	LONG_NEW_LINE("\n\n\n\n"),
	LONG_TAB("\t\t\t\t");

	private String value;

	private StructureOutput(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
