package abstractinnerclassesandinterfaces.abstractclasses.challenge;

public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // newItem is greater, move right is possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no node to the right , so add at this point
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, move left if possible
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    // there is no node to the left, so add at this point
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                // equal, so dont add
                System.out.println(newItem.getValue() + " is already present");
                return false;
            }
        }
        // we cant actually get here, but Java complains if theres no return
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        // recursive method
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
