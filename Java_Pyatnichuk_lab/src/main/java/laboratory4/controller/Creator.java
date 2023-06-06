package laboratory4.controller;

import laboratory4.model.*;
public interface Creator<T> {
    T create(String name, Human header);
}
