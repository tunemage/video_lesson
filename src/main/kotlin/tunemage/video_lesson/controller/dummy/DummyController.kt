package tunemage.video_lesson.controller.dummy

import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/dummy")
class DummyController {
    @GetMapping("/list")
    @ApiOperation(value = "ダミーアイテムを一覧取得する",notes = "ダミーアイテムを一覧取得する")
    fun getDummyItems():List<DummyRestDto>{
        var item1 = DummyRestDto()
        item1.id = 1
        item1.name = "一個目"
        var item2 = DummyRestDto()
        item2.id = 2
        item2.name = "二個目"
        var item3 = DummyRestDto()
        item3.id = 3
        item3.name = "三個目"

        var list = mutableListOf<DummyRestDto>()
        list.add(item1)
        list.add(item2)
        list.add(item3)
        return list
    }

}