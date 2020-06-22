package net.ajaskey.market.tools.SIP.BigDB.dataio;

/**
 * This enumerations class contains data structures and methods for a year of
 * company data.
 *
 * @author Andy Askey
 *         <p>
 *         Copyright (c) 2020, Andy Askey. All rights reserved.
 *         </p>
 *         <p>
 *         Permission is hereby granted, free of charge, to any person obtaining
 *         a copy of this software and associated documentation files (the
 *         "Software"), to deal in the Software without restriction, including
 *         without limitation the rights to use, copy, modify, merge, publish,
 *         distribute, sublicense, and/or sell copies of the Software, and to
 *         permit persons to whom the Software is furnished to do so, subject to
 *         the following conditions:
 *
 *         The above copyright notice and this permission notice shall be
 *         included in all copies or substantial portions of the Software.
 *         </p>
 *
 *         <p>
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *         EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *         MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *         NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 *         BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 *         ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *         CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *         SOFTWARE.
 *         </p>
 *
 */
public class FieldDataYear {

  private boolean          inUse;
  private FieldDataQuarter q1;
  private FieldDataQuarter q2;
  private FieldDataQuarter q3;
  private FieldDataQuarter q4;

  private final int year;

  public FieldDataYear(int yr) {
    this.inUse = false;
    this.year = yr;
    this.q1 = null;
    this.q2 = null;
    this.q3 = null;
    this.q4 = null;
  }

  public FieldDataQuarter getQ1() {
    return this.q1;
  }

  public FieldDataQuarter getQ2() {
    return this.q2;
  }

  public FieldDataQuarter getQ3() {
    return this.q3;
  }

  public FieldDataQuarter getQ4() {
    return this.q4;
  }

  public FieldDataQuarter getQ(int qtr) {

    FieldDataQuarter ret = null;

    if (this.inUse) {

      if (qtr == 1) {
        ret = this.q1;
      }
      else if (qtr == 2) {
        ret = this.q2;
      }
      else if (qtr == 3) {
        ret = this.q3;
      }
      else if (qtr == 4) {
        ret = this.q4;
      }
    }
    return ret;
  }

  public int getYear() {
    return this.year;
  }

  public boolean isInUse() {
    return this.inUse;
  }

  public boolean quarterDataAvailable(int qtr) {

    if (this.inUse) {
      if (qtr == 1) {
        if (this.q1 == null) {
          return false;
        }
        else if (this.q1.fieldDataList == null) {
          return false;
        }
        return true;
      }
      else if (qtr == 2) {
        if (this.q2 == null) {
          return false;
        }
        else if (this.q2.fieldDataList == null) {
          return false;
        }
        return true;
      }
      else if (qtr == 3) {
        if (this.q3 == null) {
          return false;
        }
        else if (this.q3.fieldDataList == null) {
          return false;
        }
        return true;
      }
      else if (qtr == 4) {
        if (this.q4 == null) {
          return false;
        }
        else if (this.q4.fieldDataList == null) {
          return false;
        }
        return true;
      }
    }
    return false;
  }

  public void set(int qtr, FieldDataQuarter fdq) {
    this.inUse = true;
    if (qtr == 1) {
      this.q1 = fdq;
    }
    else if (qtr == 2) {
      this.q2 = fdq;
    }
    else if (qtr == 3) {
      this.q3 = fdq;
    }
    else if (qtr == 4) {
      this.q4 = fdq;
    }
  }
}
