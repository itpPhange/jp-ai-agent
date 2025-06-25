package com.jp.jpaiagent;

import com.jp.jpaiagent.rag.LoveAppDocumentLoader;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoveAppDocumentLoaderTest {

	@Resource
	private LoveAppDocumentLoader loveAppDocumentLoader;

	@Test
	void loadMarkdowns() {
		loveAppDocumentLoader.loadMarkdowns();
	}
}
