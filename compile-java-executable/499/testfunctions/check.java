class check {

	public static void check() {
		tg_int var_count = 12;
		var_count = tg.increments(var_count, 3);
		tg.check.isEqualTo(var_count,15);
		tg.check.isNotEqualTo(var_count,12);
		tg.check.isGreaterThanOrEqualTo(var_count,15);
		tg.check.isLessThanOrEqualTo(var_count,15);
		tg.check.isGreaterThan(var_count,10);
		tg.check.isLessThan(var_count,20);
		tg.alertButton("OK");
	}
}