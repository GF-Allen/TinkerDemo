package com.alenbeyond.hotfixdemo;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by alen on 16/12/13.
 */

public class MyApplication extends TinkerApplication {

    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.alenbeyond.hotfixdemo.MyApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
