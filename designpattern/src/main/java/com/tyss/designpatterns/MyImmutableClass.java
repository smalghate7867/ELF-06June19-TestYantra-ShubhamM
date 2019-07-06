package com.tyss.designpatterns;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public final class MyImmutableClass {
private int id;
private String name;
}
