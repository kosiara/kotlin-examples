/*
 * Copyright (C) 2013 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.dagger.kotlin.ui

import android.location.LocationManager
import android.os.Bundle
import com.example.dagger.kotlin.DemoActivity
import com.example.dagger.kotlin.DemoApplication
import com.example.dagger.kotlin.R
import kotlinx.android.synthetic.activity_main.locationInfo
import javax.inject.Inject

public class HomeActivity : DemoActivity() {
    var locationManager: LocationManager? = null
        [Inject] set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (getApplication() as DemoApplication).component().inject(this)

        // TODO do something with the injected dependencies here!
        locationInfo.setText("Injected LocationManager:\n$locationManager")
    }
}
