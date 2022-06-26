package com.avinya.algorithm.utils;

import java.util.Objects;

public class CustomString {

  private String s;

  public CustomString(final String s) {
    setInternalString(s);
  }

  public int customLength() {
    return getInternalString().length();
  }

  private void setInternalString(final String s) {
    this.s = s;
  }

  private String getInternalString() {
    return this.s == null ? "" : this.s;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }

    if (getClass() != obj.getClass()) {
      return false;
    }
    if (this.s == obj) {
      return true;
    }

    return Objects.equals(this.s, obj);
  }

  @Override
  public int hashCode() {

    final int prime = 89;
    int hash = 5;

    hash = prime * hash + (this.s != null ? this.s.hashCode() : 0);

    return hash;
  }

}
