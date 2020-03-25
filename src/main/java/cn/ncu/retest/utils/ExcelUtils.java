package cn.ncu.retest.utils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import cn.ncu.retest.pojo.Score;
import jxl.Workbook;

public class ExcelUtils {
	public static List<Score> getScoreList(MultipartFile file) throws Exception {
		// 获得上传文件输入流
		InputStream is = file.getInputStream();

		// 获得工作簿
		Workbook wb = Workbook.getWorkbook(is);
		jxl.Sheet sheet = wb.getSheet(0);

		// excel行数
		int rows = sheet.getRows();

		List<Score> scoreList = new ArrayList<>();

		for (int i = 1; i < rows; i++) {
			Score score = new Score();
			// 封装后加入集合
			if (sheet.getCell(0, i).getContents().equals("")) {
				score.setBmddm(0);
			} else {

				score.setBmddm(Integer.parseInt(sheet.getCell(0, i).getContents()));
			}
			score.setBmh(sheet.getCell(1, i).getContents());
			score.setBkyxsm(sheet.getCell(2, i).getContents());
			score.setBkyxsmc(sheet.getCell(3, i).getContents());
			score.setBkzydm(sheet.getCell(4, i).getContents());
			score.setBkzymc(sheet.getCell(5, i).getContents());
			score.setYjfxm(sheet.getCell(6, i).getContents());
			score.setYjfxmc(sheet.getCell(7, i).getContents());
			score.setBkxxfsmc(sheet.getCell(8, i).getContents());
			if (sheet.getCell(9, i).getContents().equals("")) {
				score.setZzll(0.0);
			} else {

				score.setZzll(Double.parseDouble(sheet.getCell(9, i).getContents()));
			}

			if (sheet.getCell(10, i).getContents().equals("")) {
				score.setWgy(0.0);
			} else {

				score.setWgy(Double.parseDouble(sheet.getCell(10, i).getContents()));
			}

			if (sheet.getCell(11, i).getContents().equals("")) {
				score.setYwk1(0.0);
			} else {

				score.setYwk1(Double.parseDouble(sheet.getCell(11, i).getContents()));
			}

			if (sheet.getCell(12, i).getContents().equals("")) {
				score.setYwk2(0.0);
			} else {

				score.setYwk2(Double.parseDouble(sheet.getCell(12, i).getContents()));
			}

			if (sheet.getCell(13, i).getContents().equals("")) {
				score.setCszf(0.0);
			} else {

				score.setCszf(Double.parseDouble(sheet.getCell(13, i).getContents()));
			}
			score.setXm(sheet.getCell(14, i).getContents());
			score.setKsbh(sheet.getCell(15, i).getContents());
			score.setZjhm(sheet.getCell(16, i).getContents());
			score.setCsrq(sheet.getCell(17, i).getContents());
			score.setMzm(sheet.getCell(18, i).getContents());
			score.setXbm(sheet.getCell(19, i).getContents());
			score.setDaszdw(sheet.getCell(20, i).getContents());
			score.setXxgzdw(sheet.getCell(21, i).getContents());
			score.setXxgzjl(sheet.getCell(22, i).getContents());
			score.setJlcf(sheet.getCell(23, i).getContents());
			score.setKszbqk(sheet.getCell(24, i).getContents());
			score.setTxdz(sheet.getCell(25, i).getContents());
			score.setYzbm(sheet.getCell(26, i).getContents());
			score.setLxdh(sheet.getCell(27, i).getContents());
			score.setYddh(sheet.getCell(28, i).getContents());
			score.setDzxx(sheet.getCell(29, i).getContents());
			score.setBydwm(sheet.getCell(30, i).getContents());
			score.setBydw(sheet.getCell(31, i).getContents());
			score.setByzydm(sheet.getCell(32, i).getContents());
			score.setByzymc(sheet.getCell(33, i).getContents());
			score.setXxxs(sheet.getCell(34, i).getContents());
			score.setXlm(sheet.getCell(35, i).getContents());
			score.setXlzsbh(sheet.getCell(36, i).getContents());
			score.setByny(sheet.getCell(37, i).getContents());
			score.setZcxh(sheet.getCell(38, i).getContents());
			score.setXwm(sheet.getCell(39, i).getContents());
			score.setXwzsbh(sheet.getCell(40, i).getContents());
			score.setBkdwdm(sheet.getCell(41, i).getContents());
			score.setZxjh(sheet.getCell(42, i).getContents());
			score.setBklbm(sheet.getCell(43, i).getContents());
			score.setDxwpdwszdm(sheet.getCell(44, i).getContents());
			score.setDxwpdw(sheet.getCell(45, i).getContents());
			score.setZzllm(sheet.getCell(46, i).getContents());
			score.setZzllmc(sheet.getCell(47, i).getContents());
			score.setWgym(sheet.getCell(48, i).getContents());
			score.setWgymc(sheet.getCell(49, i).getContents());
			score.setYwk1m(sheet.getCell(50, i).getContents());
			score.setYwk1mc(sheet.getCell(51, i).getContents());
			score.setYwk2m(sheet.getCell(52, i).getContents());
			score.setYwk2mc(sheet.getCell(53, i).getContents());
			score.setRwpzsbh(sheet.getCell(54, i).getContents());
			score.setTcxyzbh(sheet.getCell(55, i).getContents());
			score.setRwqrxny(sheet.getCell(56, i).getContents());
			score.setRwqgxssm(sheet.getCell(57, i).getContents());
			score.setRwqgxdm(sheet.getCell(58, i).getContents());
			score.setRwqgxmc(sheet.getCell(59, i).getContents());
			score.setRwqxxxs(sheet.getCell(60, i).getContents());
			score.setRwqzydm(sheet.getCell(61, i).getContents());
			score.setRwqzymc(sheet.getCell(62, i).getContents());
			score.setRwqxlzsbh(sheet.getCell(63, i).getContents());
			score.setRwny(sheet.getCell(64, i).getContents());
			score.setRwpzdw(sheet.getCell(65, i).getContents());
			score.setTyny(sheet.getCell(66, i).getContents());
			score.setTypzdw(sheet.getCell(67, i).getContents());

			if (sheet.getCell(68, i).getContents().equals("")) {
				score.setKy(0.0);
			} else {

				score.setKy(Double.valueOf(sheet.getCell(68, i).getContents()));
			}
			if (sheet.getCell(69, i).getContents().equals("")) {
				score.setBs(0.0);
			} else {

				score.setBs(Double.valueOf(sheet.getCell(69, i).getContents()));
			}
			if (sheet.getCell(70, i).getContents().equals("")) {
				score.setMs(0.0);
			} else {

				score.setMs(Double.valueOf(sheet.getCell(70, i).getContents()));
			}

			if (sheet.getCell(71, i).getContents().equals("")) {
				score.setFs(0.0);
			} else {

				score.setFs(Double.valueOf(sheet.getCell(71, i).getContents()));
			}
			score.setKslx(sheet.getCell(72, i).getContents());
			scoreList.add(score);
		}
		return scoreList;

	}

	public static List<Score> getScoreListForCollege(MultipartFile file) throws Exception {

		// 获得上传文件输入流
		InputStream is = file.getInputStream();

		// 获得工作簿
		Workbook wb = Workbook.getWorkbook(is);
		jxl.Sheet sheet = wb.getSheet(0);

		// excel行数
		int rows = sheet.getRows();

		List<Score> scoreList = new ArrayList<>();

		for (int i = 1; i < rows; i++) {
			Score score = new Score();
			// 封装后加入集合
			if (sheet.getCell(0, i).getContents().equals("") || sheet.getCell(0, i).getContents() == null) {
				score.setBmddm(0);
			} else {

				score.setBmddm(Integer.parseInt(sheet.getCell(0, i).getContents()));

			}
			score.setKslx(sheet.getCell(1, i).getContents());
			score.setKsbh(sheet.getCell(2, i).getContents());
			score.setBkyxsm(sheet.getCell(3, i).getContents());
			score.setBkyxsmc(sheet.getCell(4, i).getContents());
			score.setBkzydm(sheet.getCell(5, i).getContents());
			score.setBkzymc(sheet.getCell(6, i).getContents());
			score.setXm(sheet.getCell(7, i).getContents());
			if (sheet.getCell(8, i).getContents().equals("")) {
				score.setZzll(0.0);
			} else {

				score.setZzll(Double.parseDouble(sheet.getCell(8, i).getContents()));
			}

			if (sheet.getCell(9, i).getContents().equals("")) {
				score.setWgy(0.0);
			} else {

				score.setWgy(Double.parseDouble(sheet.getCell(9, i).getContents()));
			}

			if (sheet.getCell(10, i).getContents().equals("")) {
				score.setYwk1(0.0);
			} else {

				score.setYwk1(Double.parseDouble(sheet.getCell(10, i).getContents()));
			}

			if (sheet.getCell(11, i).getContents().equals("")) {
				score.setYwk2(0.0);
			} else {

				score.setYwk2(Double.parseDouble(sheet.getCell(11, i).getContents()));
			}

			if (sheet.getCell(12, i).getContents().equals("")) {
				score.setCszf(0.0);
			} else {

				score.setCszf(Double.parseDouble(sheet.getCell(12, i).getContents()));
			}

			if (sheet.getCell(13, i).getContents().equals("")) {
				score.setBs(0.0);
			} else {

				score.setBs(Double.parseDouble(sheet.getCell(13, i).getContents()));
			}

			if (sheet.getCell(14, i).getContents().equals("")) {
				score.setMs(0.0);
			} else {

				score.setMs(Double.parseDouble(sheet.getCell(14, i).getContents()));
			}

			if (sheet.getCell(15, i).getContents().equals("")) {
				score.setKy(0.0);
			} else {

				score.setKy(Double.parseDouble(sheet.getCell(15, i).getContents()));
			}

			if (sheet.getCell(16, i).getContents().equals("")) {
				score.setFs(0.0);
			} else {

				score.setFs(Double.parseDouble(sheet.getCell(16, i).getContents()));
			}
			scoreList.add(score);
		}
		return scoreList;

	}
}
