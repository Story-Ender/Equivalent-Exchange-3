package com.pahimar.ee3.item;

import net.minecraft.item.ItemStack;

import com.pahimar.ee3.core.util.ItemUtil;

public class CustomStackWrapper {

    public ItemStack itemStack;

    public CustomStackWrapper(ItemStack itemStack) {

        this.itemStack = itemStack;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CustomStackWrapper)) {
            return false;
        }

        CustomStackWrapper wrappedItemStack = (CustomStackWrapper) object;

        return ItemUtil.compare(this.itemStack, wrappedItemStack.itemStack);
    }

    @Override
    public String toString() {

        return itemStack.toString();
    }

    @Override
    public int hashCode() {

        int hashCode = 1;

        hashCode = 37 * hashCode + itemStack.itemID;
        hashCode = 37 * hashCode + itemStack.getItemDamage();
        hashCode = 37 * hashCode + itemStack.stackSize;

        return hashCode;
    }
}
