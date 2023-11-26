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

import android.view.View

/**
 * 作者: wyq0918dev
 * 仓库: https://github.com/wyq0918dev/ViewContainerView
 * 时间: 2023/11/26
 * 描述: 视图容器控件管理器
 * 文档: https://github.com/wyq0918dev/ViewContainerView/blob/master/README.md
 */
class ViewContainerManager private constructor() {

    private lateinit var mContainer: ViewContainerView
    private lateinit var mChild: View

    /**
     * 2.传入视图容器控件
     */
    fun withContainerView(container: ViewContainerView): ViewContainerManager {
        this@ViewContainerManager.mContainer = container
        return this@ViewContainerManager
    }

    /**
     * 3.传入要在容器显示的控件
     */
    fun childView(child: View): ViewContainerManager {
        this@ViewContainerManager.mChild = child
        return this@ViewContainerManager
    }

    /**
     * 4.应用视图
     */
    fun apply() {
        mContainer.setView(view = mChild)
    }

    companion object {
        /**
         * 1.构建管理器
         */
        fun build(): ViewContainerManager {
            return ViewContainerManager()
        }
    }
}