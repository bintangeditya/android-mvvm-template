/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.sunflower.data

import com.google.samples.apps.sunflower.data.source.local.PlantAndGardenPlantings
import org.junit.Assert.assertTrue
import org.junit.Test

class PlantAndGardenPlantingTest {

    @Test fun test_default_values() {
        val p = PlantAndGardenPlantings()
        assertTrue(p.gardenPlantings.isEmpty())
    }
}