/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.underfs.options;

import alluxio.Configuration;
import alluxio.annotation.PublicApi;
import alluxio.security.authorization.PermissionStatus;

import com.google.common.base.Objects;

import javax.annotation.concurrent.NotThreadSafe;

/**
 * Method options for creating a file in UnderFileSystem.
 */
@PublicApi
@NotThreadSafe
public final class CreateOptions {
  // Permission status to set for the file being created.
  private PermissionStatus mPermissionStatus;

  /**
   * Constructs a default {@link CreateOptions}.
   */
  public CreateOptions() {
    mPermissionStatus = PermissionStatus.defaults();
  }

  /**
   * Constructs a {@link CreateOptions} with specified configuration.
   *
   * @param conf the configuration
   */
  public CreateOptions(Configuration conf) {
    // Only set the permission not the owner/group, because owner/group is not yet used for ufs
    // file creation.
    mPermissionStatus = PermissionStatus.defaults().applyFileUMask(conf);
  }

  /**
   * @return the permission status
   */
  public PermissionStatus getPermissionStatus() {
    return mPermissionStatus;
  }

  /**
   * Sets the permission status.
   *
   * @param permissionStatus the permission stats to set
   * @return the updated option object
   */
  public CreateOptions setPermissionStatus(PermissionStatus permissionStatus) {
    mPermissionStatus = permissionStatus;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof CreateOptions)) {
      return false;
    }
    CreateOptions that = (CreateOptions) o;
    return Objects.equal(mPermissionStatus, that.mPermissionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(mPermissionStatus);
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
        .add("permissionStatus", mPermissionStatus)
        .toString();
  }
}
