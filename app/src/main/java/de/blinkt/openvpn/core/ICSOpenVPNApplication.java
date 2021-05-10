/*
 * Copyright (c) 2012-2016 Arne Schwabe
 * Distributed under the GNU GPL v2 with additional terms. For full terms see the file doc/LICENSE.txt
 */

package de.blinkt.openvpn.core;

import android.app.Application;

public class ICSOpenVPNApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PRNGFixes.apply();

        VpnStatus.initLogCache(getApplicationContext().getCacheDir());
    }
}
