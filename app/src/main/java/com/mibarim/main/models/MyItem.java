/*
 * Copyright 2013 Google Inc.
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

package com.mibarim.main.models;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

public class MyItem implements ClusterItem {
    private final LatLng mPosition;
    private String mTitle;
    private String mSnippet;
    private long mainStationId;
    private long origMainSationId;

    public long getOrigMainSationId() {
        return origMainSationId;
    }

    public long getMainStationId() {
        return mainStationId;
    }

    public long getOrigSubStationId() {
        return origSubStationId;
    }

    private long origSubStationId;

    public MyItem(double lat, double lng, String title, long origMainStId, long origSubStId) {
        mPosition = new LatLng(lat, lng);
        mTitle = title;
        mSnippet = null;
//        destMainStationId = destMainStId;
        origMainSationId = origMainStId;
        origSubStationId = origSubStId;

    }

    public MyItem(double lat, double lng, String title, long mainStId) {
        mPosition = new LatLng(lat, lng);
        mTitle = title;
        mSnippet = null;
        mainStationId = mainStId;
//        origMainSationId = origMainStId;
//        origSubStationId = origSubStId;

    }


    public MyItem(double lat, double lng, String title) {
        mPosition = new LatLng(lat, lng);
        mTitle = title;
        mSnippet = null;
    }

    public MyItem(double lat, double lng, String title, String snippet) {
        mPosition = new LatLng(lat, lng);
        mTitle = title;
        mSnippet = snippet;
    }

    @Override
    public LatLng getPosition() {
        return mPosition;
    }

    @Override
    public String getTitle() { return mTitle; }

    @Override
    public String getSnippet() { return mSnippet; }

    /**
     * Set the title of the marker
     * @param title string to be set as title
     */
    public void setTitle(String title) {
        mTitle = title;
    }

    /**
     * Set the description of the marker
     * @param snippet string to be set as snippet
     */
    public void setSnippet(String snippet) {
        mSnippet = snippet;
    }
}