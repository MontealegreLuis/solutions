/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.exceptions.pingpong;

public enum TableSide {
    LEFT, RIGHT;

    public static TableSide fromOrdinal(int ordinal) {
        return TableSide.values()[ordinal];
    }
}
