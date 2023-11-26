/**
 * Copyright wyq0918dev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wyq0918dev.viewcontainerview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout

/**
 * 作者: wyq0918dev
 * 仓库: https://github.com/wyq0918dev/ViewContainerView
 * 时间: 2023/11/26
 * 描述: 视图容器控件
 * 文档: https://github.com/wyq0918dev/ViewContainerView/blob/master/README.md
 */
class ViewContainerView : FrameLayout {

    /**
     * 构造函数
     */
    constructor(
        context: Context
    ) : super(
        context
    )

    /**
     * 构造函数
     */
    constructor(
        context: Context, attrs: AttributeSet
    ) : super(
        context, attrs
    )

    /**
     * 构造函数
     */
    constructor(
        context: Context, attrs: AttributeSet, defStyleAttr: Int
    ) : super(
        context, attrs, defStyleAttr
    )

    /**
     * 设置视图
     */
    internal fun setView(view: View) {
        this@ViewContainerView.addView(
            view,
            LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT
            )
        )
    }
}