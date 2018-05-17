package main.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import main.business.PostManager;
import main.domain.ExecutionResult;
import main.domain.ResponseData;
import main.domain.entity.Post;
import main.storage.StorageService;

@RestController
@RequestMapping("/api/v1/post")
public class PostController {

	@Autowired
	private PostManager postManager;

	@Autowired
	private StorageService storageService;

	@GetMapping("/{userId}")
	public ResponseEntity<ResponseData> getUserPost(@PathVariable("userId") long userId) {
		ResponseData data = postManager.getUserPosts(userId);
		return ResponseEntity.status(data.getStatus()).body(data);
	}

	@PostMapping
	public ResponseEntity<ExecutionResult> insertPost(@RequestParam("file") MultipartFile file,
			@RequestParam("userId") long userId,
			@RequestParam("title") String title,
			@RequestParam("summary") String summary,
			@RequestParam("content") String content) {
		String filename = "post_file_" + System.currentTimeMillis() + FilenameUtils.EXTENSION_SEPARATOR_STR
				+ FilenameUtils.getExtension(file.getOriginalFilename());
		storageService.store(filename, file);
		Post body = new Post(null, title, summary, content, filename, userId, null);
		ExecutionResult result = postManager.insertPost(body);
		return ResponseEntity.status(result.getError() == null ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR).body(result);
	}
}
