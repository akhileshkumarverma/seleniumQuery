/*
 * Copyright (c) 2016 seleniumQuery authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.seleniumquery.internal.fluentfunctions.evaluators.matches;

import io.github.seleniumquery.SeleniumQueryObject;
import io.github.seleniumquery.internal.fluentfunctions.FluentBehaviorModifier;
import io.github.seleniumquery.internal.fluentfunctions.evaluators.Evaluator;
import io.github.seleniumquery.internal.fluentfunctions.getters.Getter;

/**
 * Evaluator that tests the elements' values against a string regex.
 *
 * @author acdcjunior
 * @since 0.9.0
 */
public class MatchesStringRegexEvaluator implements Evaluator<String> {

	private Getter<?> getter;

	public MatchesStringRegexEvaluator(Getter<?> getter) {
		this.getter = getter;
	}

	@Override
	public boolean evaluate(SeleniumQueryObject seleniumQueryObject, String regex) {
		return getter.get(seleniumQueryObject).toString().matches(regex);
	}

	@Override
	public String stringFor(String regex, FluentBehaviorModifier fluentBehaviorModifier) {
		return getter.toString() + fluentBehaviorModifier + ".matches(\"" + regex + "\")";
	}

}
