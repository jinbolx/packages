/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.android.settings.dashboard.suggestions;

import static com.google.common.truth.Truth.assertThat;

import android.util.Pair;

import com.android.internal.logging.nano.MetricsProto.MetricsEvent;

import org.junit.Test;

public class SuggestionLogHelperTest {

    @Test
    public void testGetSmartSuggestionEnabledTaggedData_disabled() {
        assertThat(SuggestionLogHelper.getSuggestionTaggedData(false)).asList().containsExactly(
                Pair.create(MetricsEvent.FIELD_SETTINGS_SMART_SUGGESTIONS_ENABLED, 0));
    }

    @Test
    public void testGetSmartSuggestionEnabledTaggedData_enabled() {
        assertThat(SuggestionLogHelper.getSuggestionTaggedData(true)).asList().containsExactly(
                Pair.create(MetricsEvent.FIELD_SETTINGS_SMART_SUGGESTIONS_ENABLED, 1));
    }
}

