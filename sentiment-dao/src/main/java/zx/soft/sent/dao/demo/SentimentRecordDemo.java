package zx.soft.sent.dao.demo;

import java.util.Date;

import zx.soft.sent.dao.common.MybatisConfig;
import zx.soft.sent.dao.domain.sentiment.RecordInsert;
import zx.soft.sent.dao.sentiment.SentimentRecord;
import zx.soft.utils.json.JsonUtils;

public class SentimentRecordDemo {

	public static void main(String[] args) {

		SentimentRecord sr = new SentimentRecord(MybatisConfig.ServerEnum.sentiment);
		// 插入数据表名
		// 2014-12-28 16:34:xx    1419755627695
		sr.insertTablename("sentiment_tablenames", "sent_records_0");
		RecordInsert recordInsert1 = new RecordInsert.Builder("sent_records_0", "123456789", 7).setMid("123abcdef")
				.setUsername("987654321").setNickname("wgybzb").setOriginal_uid("5648333").setOriginal_name("owgybzb")
				.setOriginal_title("原创标题").setOriginal_url("http://www.baidu.com").setUrl("http://www.pp.cc")
				.setHome_url("http://www.google.com").setTitle("标题").setType("美容美食").setContent("这是一条测试数据")
				.setComment_count(100).setRead_count(200).setFavorite_count(300).setAttitude_count(400)
				.setRepost_count(500).setVideo_url("http://www.video.vom").setPic_url("http://www.pic.com")
				.setVoice_url("http://www.voice.com").setTimestamp(new Date(1419755627695L)).setSource_id(153)
				.setLasttime(new Date(1419755627695L)).setServer_id(5).setIdentify_id(125633L)
				.setIdentify_md5("identifymd5value").setKeyword("美食娱乐").setFirst_time(new Date(1419755627695L))
				.setUpdate_time(new Date(1419755627695L)).setIp("192.168.1.100").setLocation("安徽省合肥市")
				.setGeo("经度:120.2366554,纬度:50.122599").setReceive_addr("wanggang@zxils.com")
				.setAppend_addr("wanggang@pp.cc").setSend_addr("wgybzb@sina.cn").setSource_name("新浪微博")
				.setCountry_code(1).setLocation_code(2130123).setProvince_code(34).setCity_code(12).setSource_type(5)
				.setOriginal_id("abchshdofoe").setIsharmful(false).build();
		RecordInsert recordInsert2 = new RecordInsert.Builder("sent_records_0", "1234567892665", 7).setMid("123abcdef")
				.setUsername("987654321").setNickname("wgybzb").setOriginal_uid("5648333").setOriginal_name("owgybzb")
				.setOriginal_title("原创标题").setOriginal_url("http://www.baidu.com").setUrl("http://www.pp.cc")
				.setHome_url("http://www.google.com").setTitle("标题").setType("美容美食").setContent("这是一条测试数据")
				.setComment_count(100).setRead_count(200).setFavorite_count(300).setAttitude_count(400)
				.setRepost_count(500).setVideo_url("http://www.video.vom").setPic_url("http://www.pic.com")
				.setVoice_url("http://www.voice.com").setTimestamp(new Date(1419755627695L + 86400_000L))
				.setSource_id(153).setLasttime(new Date(1419755627695L + 86400_000L)).setServer_id(5)
				.setIdentify_id(89666L).setIdentify_md5("identifymd5value").setKeyword("美食娱乐")
				.setFirst_time(new Date(1419755627695L + 86400_000L))
				.setUpdate_time(new Date(1419755627695L + 86400_000L)).setIp("192.168.1.100").setLocation("安徽省合肥市")
				.setGeo("经度:120.2366554,纬度:50.122599").setReceive_addr("wanggang@zxils.com")
				.setAppend_addr("wanggang@pp.cc").setSend_addr("wgybzb@sina.cn").setSource_name("新浪微博")
				.setCountry_code(1).setLocation_code(2130123).setProvince_code(34).setCity_code(12).setSource_type(4)
				.setOriginal_id("djdjfieiofg0").setIsharmful(true).build();
		RecordInsert recordInsert3 = new RecordInsert.Builder("sent_records_0", "1234567892665", 7).setMid("123abcdef")
				.setUsername("987654321").setNickname("wgybzb").setOriginal_uid("5648333").setOriginal_name("owgybzb")
				.setOriginal_title("原创标题").setOriginal_url("http://www.baidu.com").setUrl("http://www.pp.cc")
				.setHome_url("http://www.google.com").setTitle("标题").setType("美容美食").setContent("这是一条测试数据")
				.setComment_count(1100).setRead_count(1200).setFavorite_count(1300).setAttitude_count(1400)
				.setRepost_count(1500).setVideo_url("http://www.video.vom").setPic_url("http://www.pic.com")
				.setVoice_url("http://www.voice.com").setTimestamp(new Date(1419755627695L + 86400_000L * 2))
				.setSource_id(153).setLasttime(new Date(1419755627695L + 86400_000L * 2)).setServer_id(5)
				.setIdentify_id(89666L).setIdentify_md5("identifymd5value").setKeyword("美食娱乐")
				.setFirst_time(new Date(1419755627695L + 86400_000L * 2))
				.setUpdate_time(new Date(1419755627695L + 86400_000L * 2)).setIp("192.168.1.100").setLocation("安徽省合肥市")
				.setGeo("经度:120.2366554,纬度:50.122599").setReceive_addr("wanggang@zxils.com")
				.setAppend_addr("wanggang@pp.cc").setSend_addr("wgybzb@sina.cn").setSource_name("新浪微博")
				.setCountry_code(1).setLocation_code(2130123).setProvince_code(34).setCity_code(12).setSource_type(4)
				.setOriginal_id("djdjfieiofg0").setIsharmful(true).build();
		// 插入Record数据
		sr.insertRecord(recordInsert1);
		sr.insertRecord(recordInsert2);
		// 获取Record数据，根据md5的id
		System.out.println(JsonUtils.toJson(sr.selectRecordById("sent_records_0", "123456789")));
		System.out.println(JsonUtils.toJson(sr.selectRecordById("sent_records_0", "1234567892665")));
		// 更新Record数据
		sr.updateRecord(recordInsert3);
		System.out.println(JsonUtils.toJson(sr.selectRecordById("sent_records_0", "1234567892665")));
		// 获取Records数据，根据lasttime
		System.out.println(sr.selectRecordsByLasttime("sent_records_0", new Date(1419755627695L),
				new Date(1419755627695L + 86400_000L * 2)).size());
		System.out.println(sr.selectRecordsByLasttime("sent_records_0", new Date(1419755627695L),
				new Date(1419755627695L + 86400_000L)).size());
		System.out.println(sr.selectRecordsByLasttime("sent_records_0", new Date(1419755627695L),
				new Date(1419755627695L)).size());
		System.out.println(sr.selectRecordsByLasttime("sent_records_0", new Date(1419755625695L),
				new Date(1419755626695L)).size());
		// 删除Record数据，根据md5的id
		sr.deleteRecordById("sent_records_0", "123456789");
		sr.deleteRecordById("sent_records_0", "1234567892665");
		// 获取最大Id

	}

}
