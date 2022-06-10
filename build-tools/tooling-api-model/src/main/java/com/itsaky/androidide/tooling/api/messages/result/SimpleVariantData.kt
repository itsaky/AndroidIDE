/*
 *  This file is part of AndroidIDE.
 *
 *  AndroidIDE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  AndroidIDE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with AndroidIDE.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.itsaky.androidide.tooling.api.messages.result

import java.io.Serializable

/**
 * Contains simple data about a variant in an Android module project.
 *
 * @author Akash Yadav
 */
data class SimpleVariantData(
    val name: String,
    val mainArtifact: SimpleArtifact,
    val otherArtifacts: Map<String, SimpleArtifact>
): Serializable {
    private val serialVersionUID = 1L
}
