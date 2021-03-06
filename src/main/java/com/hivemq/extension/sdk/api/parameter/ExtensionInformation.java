/*
 * Copyright 2018 dc-square GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hivemq.extension.sdk.api.parameter;

import com.hivemq.extension.sdk.api.annotations.DoNotImplement;
import com.hivemq.extension.sdk.api.annotations.Immutable;
import com.hivemq.extension.sdk.api.annotations.NotNull;

import java.io.File;
import java.util.Optional;

/**
 * Detailed information about a extension.
 *
 * @author Christoph Schäbel
 * @since 4.0.0
 */
@Immutable
@DoNotImplement
public interface ExtensionInformation {

    /**
     * @return The unique ID of a extension.
     * @since 4.0.0
     */
    @NotNull
    String getId();

    /**
     * @return The version of a extension.
     * @since 4.0.0
     */
    @NotNull
    String getVersion();

    /**
     * @return The human readable name of a extension.
     * @since 4.0.0
     */
    @NotNull
    String getName();

    /**
     * @return The author of a extension, if the extension provides information about the author.
     * @since 4.0.0
     */
    @NotNull
    Optional<String> getAuthor();

    /**
     * @return The extensions installation folder.
     * @since 4.0.0
     */
    @NotNull
    File getExtensionHomeFolder();

}