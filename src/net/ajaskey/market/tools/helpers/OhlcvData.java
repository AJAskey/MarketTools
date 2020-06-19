
package net.ajaskey.market.tools.helpers;

import net.ajaskey.common.DateTime;

/**
 * This class...
 *
 * @author ajask_000
 *         <p>
 *         PTV-Parser Copyright (c) 2015, Andy Askey. All rights reserved.
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
public class OhlcvData {

  public enum FormType {
    FULL, SHORT
  }

  public double    close;

  public DateTime date;
  public double    high;
  public double    low;
  public double open;
  public long      volume;
  private FormType form;

  private boolean  valid;

  /**
   * This method serves as a constructor for the class.
   *
   */
  public OhlcvData() {

    // TODO Auto-generated constructor stub
  }

  /**
   *
   * This method serves as a constructor for the class.
   *
   * @param dt
   * @param o
   * @param h
   * @param l
   * @param c
   * @param vol
   */
  public OhlcvData(final DateTime dt, final double o, final double h, final double l, final double c, final long vol) {

    this.date = dt;
    this.open = o;
    this.high = h;
    this.low = l;
    this.close = c;
    this.volume = vol;
    this.setForm();
    this.valid = true;
  }

  /**
   *
   * This method serves as a constructor for the class.
   *
   * @param fld
   * @param fmt
   */
  public OhlcvData(String fld[], String fmt, int startIdx) {

    try {
      this.date = new DateTime(fld[startIdx].trim(), fmt);
      if (this.date.isNull()) {
        this.valid = false;
        return;
      }
      this.open = Double.parseDouble(fld[startIdx + 1].trim());
      this.high = Double.parseDouble(fld[startIdx + 2].trim());
      this.low = Double.parseDouble(fld[startIdx + 3].trim());
      this.close = Double.parseDouble(fld[startIdx + 4].trim());
      this.volume = Long.parseLong(fld[startIdx + 5].trim());
      this.setForm();

      this.valid = true;

    }
    catch (final Exception e) {
      e.printStackTrace();
      this.valid = false;
    }
  }

  /**
   * @return the form
   */
  public FormType getForm() {

    return this.form;
  }

  public boolean isValid() {

    // valid = this.date.isValid();

    return this.valid;
  }

  public String toShortString() {

    final String ret = String.format("%s\t%10.2f", this.date, this.close);
    return ret;
  }

  @Override
  public String toString() {

    final String dt = this.date.format("dd-MMM-yyyy");
    final String ret = String.format("%s\t%10.2f\t%10.2f\t%10.2f\t%10.2f\t%10d\t%s", dt, this.open, this.high, this.low, this.close, this.volume,
        this.form);
    return ret;
  }

  /**
   *
   * net.ajaskey.market.tools.helpers.setForm
   *
   */
  private void setForm() {

    if (this.open == this.high && this.high == this.low && this.low == this.close) {
      this.setForm(FormType.SHORT);
    }
    else {
      this.setForm(FormType.FULL);
    }
  }

  /**
   * @param form the form to set
   */
  private void setForm(final FormType form) {

    this.form = form;
  }

}
