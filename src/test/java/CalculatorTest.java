import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * <pre>
 * Copyright 2017 NHN Entertainment Corp. All rights Reserved.
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * </pre>
 * <p/>
 * Desc	:
 *
 * @Author    : flysky@nhnent.com
 * @Date    : 2017. 7. 17.
 */
public class CalculatorTest {

	@Test
	public void testAdd() throws Exception {
		int result = Calculator.add(1, 2);
		assertEquals(3, result);
	}
}
