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

package com.hivemq.extension.sdk.api.packets.general;

import com.hivemq.extension.sdk.api.annotations.DoNotImplement;
import com.hivemq.extension.sdk.api.annotations.NotNull;

import java.util.List;

/**
 * Interface to modify {@link UserProperties} received from any MQTT packet.
 *
 * @author Christoph Schäbel
 * @author Florian Limpöck
 * @since 4.0.0
 */
@DoNotImplement
public interface ModifiableUserProperties extends UserProperties {

    /**
     * Add a new {@link UserProperty}.
     *
     * @param userProperty The user property to add.
     * @throws NullPointerException If userProperty is null.
     * @since 4.0.0
     */
    void addUserProperty(@NotNull UserProperty userProperty);

    /**
     * Add a new {@link UserProperty}.
     *
     * @param name  The name of the user property to add.
     * @param value The name of the user property to add.
     * @throws NullPointerException If any parameter is null.
     * @since 4.0.0
     */
    void addUserProperty(@NotNull String name, @NotNull String value);

    /**
     * Remove a {@link UserProperty}.
     *
     * @param name  The name of the user property to remove.
     * @param value The value of the user property to remove.
     * @throws NullPointerException If any parameter is null.
     * @since 4.0.0
     */
    void removeUserProperty(@NotNull String name, @NotNull String value);

    /**
     * Remove every {@link UserProperty} with the specified name.
     *
     * @param name The name of the user properties to remove.
     * @return A list of the removed user properties.
     * @throws NullPointerException If name is null.
     * @since 4.0.0
     */
    @NotNull
    List<UserProperty> removeName(@NotNull String name);

    /**
     * Removes all user properties.
     *
     * @since 4.0.0
     */
    void clear();

}