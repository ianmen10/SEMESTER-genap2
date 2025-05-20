public class NodeFilm14 {
    Film14 data;
    NodeFilm14 prev, next;

    public NodeFilm14(NodeFilm14 prev, Film14 data, NodeFilm14 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
