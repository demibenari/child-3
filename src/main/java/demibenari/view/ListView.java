package demibenari.view;

import demibenari.common.entities.Item;

import java.util.List;

/**
 *
 * Created by Demi on 12/13/2014.
 */
public interface ListView {
    public void addItems(List<Item> items);
    public void updateItems(List<Item> items);
    public void removeItems(List<Item> items);
}
