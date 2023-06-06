package laboratory3.controller;

import laboratory3.model.*;
public interface Creator<T> {
    T create(String name, Human header);
}
